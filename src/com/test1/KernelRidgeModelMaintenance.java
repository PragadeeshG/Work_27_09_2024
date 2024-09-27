package com.test1;

public class KernelRidgeModelMaintenance {
	private Integer kernelDeviceId;
	private String nonParametric;
	private String interpolation;
	private String marginalization;
	private String hyperParams;
	private String meanFunction;
	private String kernelFunction;
	private boolean distributionsActive;
	private String priorDist;
	private String posteriorDist;
	private String augumentedPrediction;
	private String rationalQuadratic;
	private String status;

	public KernelRidgeModelMaintenance() {

	}

	public KernelRidgeModelMaintenance(Integer kernelDeviceId, String nonParametric, String interpolation,
			String marginalization, String hyperParams, String meanFunction, String kernelFunction,
			boolean distributionsActive, String priorDist, String posteriorDist, String augumentedPrediction,
			String rationalQuadratic, String status) {
		super();
		this.kernelDeviceId = kernelDeviceId;
		this.nonParametric = nonParametric;
		this.interpolation = interpolation;
		this.marginalization = marginalization;
		this.hyperParams = hyperParams;
		this.meanFunction = meanFunction;
		this.kernelFunction = kernelFunction;
		this.distributionsActive = distributionsActive;
		this.priorDist = priorDist;
		this.posteriorDist = posteriorDist;
		this.augumentedPrediction = augumentedPrediction;
		this.rationalQuadratic = rationalQuadratic;
		this.status = status;
	}

	public Integer getKernelDeviceId() {
		return kernelDeviceId;
	}

	public void setKernelDeviceId(Integer kernelDeviceId) {
		this.kernelDeviceId = kernelDeviceId;
	}

	public String getNonParametric() {
		return nonParametric;
	}

	public void setNonParametric(String nonParametric) {
		this.nonParametric = nonParametric;
	}

	public String getInterpolation() {
		return interpolation;
	}

	public void setInterpolation(String interpolation) {
		this.interpolation = interpolation;
	}

	public String getMarginalization() {
		return marginalization;
	}

	public void setMarginalization(String marginalization) {
		this.marginalization = marginalization;
	}

	public String getHyperParams() {
		return hyperParams;
	}

	public void setHyperParams(String hyperParams) {
		this.hyperParams = hyperParams;
	}

	public String getMeanFunction() {
		return meanFunction;
	}

	public void setMeanFunction(String meanFunction) {
		this.meanFunction = meanFunction;
	}

	public String getKernelFunction() {
		return kernelFunction;
	}

	public void setKernelFunction(String kernelFunction) {
		this.kernelFunction = kernelFunction;
	}

	public boolean isDistributionsActive() {
		return distributionsActive;
	}

	public void setDistributionsActive(boolean distributionsActive) {
		this.distributionsActive = distributionsActive;
	}

	public String getPriorDist() {
		return priorDist;
	}

	public void setPriorDist(String priorDist) {
		this.priorDist = priorDist;
	}

	public String getPosteriorDist() {
		return posteriorDist;
	}

	public void setPosteriorDist(String posteriorDist) {
		this.posteriorDist = posteriorDist;
	}

	public String getAugumentedPrediction() {
		return augumentedPrediction;
	}

	public void setAugumentedPrediction(String augumentedPrediction) {
		this.augumentedPrediction = augumentedPrediction;
	}

	public String getRationalQuadratic() {
		return rationalQuadratic;
	}

	public void setRationalQuadratic(String rationalQuadratic) {
		this.rationalQuadratic = rationalQuadratic;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
