package yorkzhang.srpdemo;

import org.springframework.data.jpa.repository.JpaRepository;

 interface ClientRepository  extends JpaRepository<Client, Long> {
}
