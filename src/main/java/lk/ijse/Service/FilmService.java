package lk.ijse.Service;

import lk.ijse.DTO.FilmDTO;

import java.util.ArrayList;

public interface FilmService {

    public boolean saveMovie(FilmDTO filmDTO);

    public ArrayList<FilmDTO> getAllFilms();



}
