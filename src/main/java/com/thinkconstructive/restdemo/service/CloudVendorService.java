package com.thinkconstructive.restdemo.service;

import java.util.List;

import com.thinkconstructive.restdemo.model.CloudVendor;

public interface CloudVendorService {

	public CloudVendor getCloudVendor(String cloudVendorId);

	public String createCloudVendor(CloudVendor cloudVendor);

	public String updateCloudVendor(CloudVendor cloudVendor);

	public String deleteCloudVendor(String cloudVendorId);

	public List<CloudVendor> getAllCloudVendors();
}
