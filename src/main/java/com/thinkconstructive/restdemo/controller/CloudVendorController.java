package com.thinkconstructive.restdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	CloudVendorService cloudVendorService;

	public CloudVendorController(CloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}

//	get/read specific cloud vendor details
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {

		return cloudVendorService.getCloudVendor(vendorId);
	}

//	read all cloud vendors

	@GetMapping
	public List<CloudVendor> getAllCloudVendorDetails() {

		return cloudVendorService.getAllCloudVendors();
	}

//	create cloud vendor details
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud vender created successfully.!";
	}

//	update
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "Cloud vender updated successfully.!";
	}

//	delete
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		cloudVendorService.deleteCloudVendor(vendorId);
		return "Cloud vender deleted successfully.!";
	}

}
