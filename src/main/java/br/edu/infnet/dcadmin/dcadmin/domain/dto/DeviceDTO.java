package br.edu.infnet.dcadmin.dcadmin.domain.dto;

import br.edu.infnet.dcadmin.dcadmin.domain.Device;

public class DeviceDTO {

	private Long id;
	private String serialNumber;
	private String hostname;
	private String type;
	private String role;

	public DeviceDTO(Long id, String serialNumber, String hostname, String type, String role) {
		super();
		this.id = id;
		this.serialNumber = serialNumber;
		this.hostname = hostname;
		this.type = type;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Device transformaParaObjeto() {
		return new Device();
	}

}
