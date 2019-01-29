package lk.ijse.Service.Impl;

import lk.ijse.DTO.FilmDTO;
import lk.ijse.Model.Film;
import lk.ijse.Repo.FilmRepo;
import lk.ijse.Service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    FilmRepo filmRepo;


    @Override
    public boolean saveMovie(FilmDTO filmDTO) {
        Film film=new Film(filmDTO.getName(),filmDTO.getLanguage(),filmDTO.getStartDate(),filmDTO.getEndDate(),filmDTO.getAmount());
        filmRepo.save(film);
        return true;
    }

    @Override
    public ArrayList<FilmDTO> getAllFilms() {
        List<Film> filmList=filmRepo.findAll();

        ArrayList<FilmDTO> filmDTOS=new ArrayList<>();

        for(Film film : filmList){
            FilmDTO filmDTO=new FilmDTO(film.getFid(),film.getName(),film.getLanguage(),film.getStartDate(),film.getEndDate(),film.getAmount());

            filmDTOS.add(filmDTO);
        }
        return filmDTOS;
    }
}
