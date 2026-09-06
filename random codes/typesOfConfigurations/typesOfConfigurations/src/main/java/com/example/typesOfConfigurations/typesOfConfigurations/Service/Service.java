package com.example.typesOfConfigurations.typesOfConfigurations.Service;

import com.example.typesOfConfigurations.typesOfConfigurations.Repository.Repository;

public class Service {

    private int val;
    private Repository repository;

    Service(Repository repository)
    {
        this.repository=repository;
    }

    public void setVal(int val)
    {
        this.val=val;
    }

    public void serviceMethod()
    {
        System.out.println("inside Service method... val="+val);
        repository.repoMethod();
    }
}
