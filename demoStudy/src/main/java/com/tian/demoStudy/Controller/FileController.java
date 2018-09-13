package com.tian.demoStudy.Controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tian.demoStudy.common.ResultInfo;

@RestController
public class FileController {
	
	private static final String path = "C:\\Users\\Administrator\\Desktop\\testDemo\\";

	@PostMapping(value = "/upload",produces = {"application/json;charset=UTF-8"})
	public ResultInfo<Object> upLoad(@RequestParam("file") MultipartFile file,HttpServletRequest request) {
		ResultInfo<Object> result = new ResultInfo<Object>();
		//file.getInputStream();
		String fileName = file.getOriginalFilename();
		String name  = (String) request.getAttribute("name");
		
		//获取文件的后缀
		String suffixName = fileName.substring(fileName.lastIndexOf("."));
		
		fileName = UUID.randomUUID()+suffixName;
		List<Object> list = new ArrayList<Object>();
		list.add(fileName);
		File dest = new File(path+fileName);
		
		result.setName(name);
		result.setResultList(list);
		try {
			file.transferTo(dest);
			result.setMsg("success");
		} catch (IOException e) {
			//result.setMsg("error");
			result.setMsg(e.getMessage());
			e.printStackTrace();
		}
		
		return result;
	}
}
