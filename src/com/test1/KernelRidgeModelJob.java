package com.test1;

public class KernelRidgeModelJob {
	private Integer kernelDeviceId;
	private String kernelDeviceName;
	private String kernelDeviceRegistry;
	private String kernelDeviceStartTime;
	private String kernelDeviceApprovedTime;
	private String kernelDeviceOwner;
	private boolean authorizedDevice;
	private String timeOutInSeconds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public KernelRidgeModelJob() {

	}

	public KernelRidgeModelJob(Integer kernelDeviceId, String kernelDeviceName, String kernelDeviceRegistry,
			String kernelDeviceStartTime, String kernelDeviceApprovedTime, String kernelDeviceOwner,
			boolean authorizedDevice, String timeOutInSeconds, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.kernelDeviceId = kernelDeviceId;
		this.kernelDeviceName = kernelDeviceName;
		this.kernelDeviceRegistry = kernelDeviceRegistry;
		this.kernelDeviceStartTime = kernelDeviceStartTime;
		this.kernelDeviceApprovedTime = kernelDeviceApprovedTime;
		this.kernelDeviceOwner = kernelDeviceOwner;
		this.authorizedDevice = authorizedDevice;
		this.timeOutInSeconds = timeOutInSeconds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getKernelDeviceId() {
		return kernelDeviceId;
	}

	public void setKernelDeviceId(Integer kernelDeviceId) {
		this.kernelDeviceId = kernelDeviceId;
	}

	public String getKernelDeviceName() {
		return kernelDeviceName;
	}

	public void setKernelDeviceName(String kernelDeviceName) {
		this.kernelDeviceName = kernelDeviceName;
	}

	public String getKernelDeviceRegistry() {
		return kernelDeviceRegistry;
	}

	public void setKernelDeviceRegistry(String kernelDeviceRegistry) {
		this.kernelDeviceRegistry = kernelDeviceRegistry;
	}

	public String getKernelDeviceStartTime() {
		return kernelDeviceStartTime;
	}

	public void setKernelDeviceStartTime(String kernelDeviceStartTime) {
		this.kernelDeviceStartTime = kernelDeviceStartTime;
	}

	public String getKernelDeviceApprovedTime() {
		return kernelDeviceApprovedTime;
	}

	public void setKernelDeviceApprovedTime(String kernelDeviceApprovedTime) {
		this.kernelDeviceApprovedTime = kernelDeviceApprovedTime;
	}

	public String getKernelDeviceOwner() {
		return kernelDeviceOwner;
	}

	public void setKernelDeviceOwner(String kernelDeviceOwner) {
		this.kernelDeviceOwner = kernelDeviceOwner;
	}

	public boolean isAuthorizedDevice() {
		return authorizedDevice;
	}

	public void setAuthorizedDevice(boolean authorizedDevice) {
		this.authorizedDevice = authorizedDevice;
	}

	public String getTimeOutInSeconds() {
		return timeOutInSeconds;
	}

	public void setTimeOutInSeconds(String timeOutInSeconds) {
		this.timeOutInSeconds = timeOutInSeconds;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
