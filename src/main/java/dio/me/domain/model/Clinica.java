package dio.me.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity(name = "tb_Clinica")
public class Clinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clinicaGeral;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<especializada> especializada;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getClinicaGeral() {
        return clinicaGeral;
    }
    public void setClinicaGeral(String clinicaGeral) {
        this.clinicaGeral = clinicaGeral;
    }
   
    
}
