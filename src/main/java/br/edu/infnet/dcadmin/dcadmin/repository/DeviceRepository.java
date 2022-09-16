package br.edu.infnet.dcadmin.dcadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.dcadmin.dcadmin.domain.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

}
