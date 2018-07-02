package com.hcl.kafka.auditserviceconsumer.model;

public class AuditResponse {

	private Long id;
	private String service;
	private String statusCode;
	private String statusDesc;
	private String timestamp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public AuditResponse() {
	}

	public AuditResponse(Long id, String service, String statusCode,
			String statusDesc, String timestamp) {
		super();

		this.id = id;
		this.service = service;
		this.statusCode = statusCode;
		this.statusDesc = statusDesc;
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "AuditResponse [id=" + id + ", service=" + service
				+ ", statusCode=" + statusCode + ", statusDesc=" + statusDesc
				+ ", timestamp=" + timestamp + "]";
	}

}