package com.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bean.Pbra;
import com.bean.Pimg;
import com.bean.Product;
import com.bean.Ptype;
import com.service.PbraServiceImp;
import com.service.PimgServiceImp;
import com.service.ProductService;
import com.service.PtypeServiceImp;
@Controller
public class ContentController {
	
	@Autowired
	private ProductService productService;
	@Autowired
	private PtypeServiceImp ptypeServiceImp;
	@Autowired
	private PbraServiceImp pbraServiceImp;
	
	@Autowired
	private PimgServiceImp pimgServiceImp;
	 @RequestMapping(value="/upload",method=RequestMethod.POST)
     public String upload(HttpServletRequest request,
            @RequestParam("file") MultipartFile file,Product product,int ppbid,int pptid) throws Exception {
		
        //如果文件不为空，写入上传路径
        if(!file.isEmpty()) {
            //上传文件路径
            String path = request.getRealPath("/images/");
            //上传文件名
            String filename = file.getOriginalFilename();
            File filepath = new File(path,filename);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) { 
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件当中
            file.transferTo(new File(path + File.separator + filename));
            Ptype ptype=ptypeServiceImp.getById(pptid);
            Pbra pbra=pbraServiceImp.getId(ppbid);
            product.setPbid(pbra);
            product.setPtid(ptype);
            Pimg img=new Pimg();
              img.setPurl(filename);
              pimgServiceImp.inpi(img);
              System.out.println(img.getPimgid());
              Pimg pimg=pimgServiceImp.getByPbid(img.getPimgid());
              System.out.println(pimg);
             product.setPimg(pimg);
             System.out.println(product);
             productService.save(product);
            return "success";
        } else {
            return "error";
        }
     }
}
