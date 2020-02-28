package com.adb.demo.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adb.demo.dao.ContactRepository;
import com.adb.demo.entity.ContactEntity;
import com.adb.demo.model.ContactModel;
import com.adb.demo.model.GroupModel;
import com.adb.demo.service.GroupProxyService;

@RestController
@RequestMapping("/contacts")
public class ContactApi {
	
	@Autowired
	private ContactRepository contactRepo;
	
	@Autowired
	private GroupProxyService gps;
	
	@GetMapping("/{id}")
	public ResponseEntity<ContactModel> getContactById(@PathVariable(name="id") Long contactId){
		ResponseEntity<ContactModel> result;
		
		ContactEntity entity=contactRepo.findById(contactId).orElse(null);
		
		if(null!=entity) {
			GroupModel groupModel=gps.getGroupModel(entity.getGroupCode());
			
			ContactModel model=new ContactModel(entity, groupModel);
			
			result=new ResponseEntity<ContactModel>(model,HttpStatus.OK);
		}else {
			result=new ResponseEntity<ContactModel>(HttpStatus.NOT_FOUND);
		}
		
		return result;
	} 
	

}
