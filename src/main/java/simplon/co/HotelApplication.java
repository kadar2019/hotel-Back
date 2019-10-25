package simplon.co;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import simplon.co.dao.HotelRepository;
import simplon.co.entities.Hotel;

@SpringBootApplication
public class HotelApplication implements CommandLineRunner {
@Autowired

 private HotelRepository HotelRepository;
	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       HotelRepository.save(new Hotel(null,"Nasriin","Hargeysa",123,"Confortable",true,false,true,null,4));
		HotelRepository.save(new Hotel(null,"Maamus","Gabiley",201,"Confortable",true,false,true,null,3));
		HotelRepository.save(new Hotel(null,"Nuura","toulouse",100,"Confortable",true,false,true,null,7));
		HotelRepository.save(new Hotel(null,"Burco","Paris",193,"Confortable",true,false,true,null,6));

		HotelRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});
	}
}
