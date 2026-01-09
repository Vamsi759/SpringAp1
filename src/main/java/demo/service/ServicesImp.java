package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entity.Person1;
import demo.repo.Person1Repo;


@Service
public class ServicesImp implements Services{

	@Autowired
	Person1Repo r;
	
	@Override
	public void Save() {
		// TODO Auto-generated method stub
		Person1 p=new Person1();
		p.setName("vamsi");
		r.save(p);
		
	}
	

}
