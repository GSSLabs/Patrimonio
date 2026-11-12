package https.github.com.GSSLabs.Patrimonio.git.patrimonio.repository;

import https.github.com.GSSLabs.Patrimonio.git.patrimonio.Model.Patrimonio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository/*
public class PatrimonioRepository {

}
*/
public interface PatrimonioRepository extends JpaRepository<Patrimonio, Long> {

}