package book;

import java.util.Date;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Component
public class dateOfbook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stt;
	private Date date;
	
	@OneToOne
    @JoinColumn(name = "id")
    private Book book;
	
}
