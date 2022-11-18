package br.com.senac.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import br.com.senac.model.entity.ArquivoModel;
import br.com.senac.model.repository.ArquivoRepository;

@Controller
public class UploadArquivoController {

	
	@Autowired
	ArquivoRepository fileRepository;
	
	@GetMapping("/")
	public String index() {
		return "uploadform";
	}
	
	@PostMapping("/")
	public String uploadMultipartFile(MultipartFile[] files, Model model) {
		List <String> fileNames = new ArrayList();
	
		try {
			List <ArquivoModel> storedFile = new ArrayList <ArquivoModel>();
			
			for (MultipartFile file: files) {
				ArquivoModel fileModel = fileRepository.findByName(file.getOriginalFilename());
				if(fileModel != null) {
					//upload new contents
					fileModel.setPic(file.getBytes());
				} else {
					fileModel = new ArquivoModel(file.getOriginalFilename(), file.getContentType(),
							file.getBytes());
				}
				
				fileNames.add(file.getOriginalFilename());
				storedFile.add(fileModel);
				
			}
		//Save all files to database
			
			fileRepository.saveAll(storedFile);
			
			model.addAttribute("message", "Files uploaded sucessfully");
			model.addAttribute("files", fileNames);
		}
		catch (Exception e) {
			model.addAttribute("message", "Fail");
			model.addAttribute("files", fileNames);
		}
		return "uploadform";
	}
	
}
