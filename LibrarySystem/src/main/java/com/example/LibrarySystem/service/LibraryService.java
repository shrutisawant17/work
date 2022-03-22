package com.example.LibrarySystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibrarySystem.domain.Library;
import com.example.LibrarySystem.repository.LibraryRepository;

@Service
public class LibraryService
{

    @Autowired
    private LibraryRepository repo;

    public List<Library> listAll()
    {
        return repo.findAll();
    }

    public void save(Library std)
    {
        repo.save(std);
    }

    public Library get(long id)
    {
        return repo.findById(id).get();
    }

    public void delete(long id)
    {
        repo.deleteById(id);
    }
   
}
