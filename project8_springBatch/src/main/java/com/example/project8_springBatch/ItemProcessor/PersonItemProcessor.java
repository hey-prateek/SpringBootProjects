package com.example.project8_springBatch.ItemProcessor;

import com.example.project8_springBatch.Entity.person;
import org.springframework.batch.infrastructure.item.ItemProcessor;
import org.springframework.stereotype.Component;

//item processor class which processes each item during batch job - Convert Names to Uppercase
//implementing ItemProcessor interface
@Component
public class PersonItemProcessor implements ItemProcessor<person, person> {

    //overriding "process" method
    @Override
    public person process(person p) {
        return new person(p.getId(), p.getFirstName().toUpperCase().trim(),
                p.getLastName().toUpperCase().trim(), p.getEmail());
    }
}
