package com.javacodegeeks.snippets.enterprise.fileupload.model;

import org.springframework.web.multipart.MultipartFile;

public class File {
		 
		MultipartFile file;

		public MultipartFile getFile() {
			return file;
		}

		public void setFile(MultipartFile file) {
			this.file = file;
		}
		
}
