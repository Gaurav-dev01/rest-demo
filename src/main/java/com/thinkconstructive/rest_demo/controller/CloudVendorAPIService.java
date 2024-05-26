package com.thinkconstructive.rest_demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.rest_demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	CloudVendor cloudVendor;

//	get
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
		return cloudVendor;
	}

//	create
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud vender created successfully.!";
	}

//	update
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud vender updated successfully.!";
	}

//	delete
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
		this.cloudVendor = null;
		return "Cloud vender deleted successfully.!";
	}

}
