package com.codec.codec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.codec.services.FileService;
import com.codec.services.*;

@SpringBootApplication
public class CodecApplication {

	public static void main(String[] args) {
		if(args.length== 1){
		FileService fs = new FileService(args[0]);
		fs.listFilesForFolder(fs.folderPath);
		AudioConverter.convertFiles(fs.getListOfFiles());
		SpringApplication.run(CodecApplication.class, args);
		}
		else
		{
			System.out.println("ERROR:wrong number of parameters supplied. Please run with single directory path as input parameter.");
		}
	}
}
