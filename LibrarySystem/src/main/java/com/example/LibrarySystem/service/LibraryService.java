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

    public List<Library> getAllLibrary()
    {
        return repo.findAll();
    }

    public void saveLibrary(Library library)
    {
        repo.save(library);
    }

    public Library getLibraryById(Long id)
    {
        return repo.findById(id).get();
    }

    public Library updateLibrary(Library library)
    {
        return repo.save(library);
    }

    public void delete(Long id)
    {
        repo.deleteById(id);
    }

}