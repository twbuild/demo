package com.example.demo.service.Impl;

import com.example.demo.domain.grilDomain;
import com.example.demo.repository.grilRepository;
import com.example.demo.service.grilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class grilImpl implements grilService {

    @Autowired
    grilRepository _grilRepository;

    @Override
    public List<grilDomain> getGrilByAge(Integer age) {
        return _grilRepository.findAllByAge(age);
        //return null;
    }

    @Override
    public String addGril(grilDomain g) {
        List<grilDomain> gList = null;
        gList.add(g);
        try {
            _grilRepository.saveAll(gList);
        }
        catch(Exception e) {
            return "[{'result':'false'}]";
        }
        return "[{'result':'true'}]";
    }

    @Override
    public String editGril(grilDomain g) {
        return null;
    }

    @Override
    public String deleteGril(grilDomain g) {
        return this.deleteGrilById(g.getId());
        //return null;
    }

    @Override
    public String deleteGrilById(Integer id) {
        try {
            _grilRepository.deleteById(id);
        }
        catch(Exception e) {
            return "[{'result':'false'}]";
        }
        return "[{'result':'true'}]";
        //return null;
    }
}
