package com.jamesmansour.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Locale;

@Controller
public class MainController {
    //static albums (Want to not have this in the near future)
    static ArrayList<Album> albums = new ArrayList<>();

    static {
        albums.add(
                new Album("Album1", "Artist1", 100, 18200, "https://www.rollingstone.com/wp-content/uploads/2019/09/shutterstock_1242494212.jpg?resize=1800,1200&w=1200")
        );
        albums.add(
                new Album("Album2", "Artist2", 10, 6000, "https://www.rollingstone.com/wp-content/uploads/2019/09/shutterstock_1242494212.jpg?resize=1800,1200&w=1200")
        );
        albums.add(
                new Album("Album3", "Artist3", 15, 10001, "https://www.rollingstone.com/wp-content/uploads/2019/09/shutterstock_1242494212.jpg?resize=1800,1200&w=1200")
        );
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello-world.html";
    }

    @GetMapping("/capitalize/{toCapitalize}")
    public String capitalize(Model m, @PathVariable String toCapitalize) {
        m.addAttribute("string", toCapitalize.toUpperCase());
        return "capitalize.html";
    }

    @GetMapping("/")
    public String Landing() {
        return "landing.html";
    }

    @GetMapping("/albums")
    public String getAlbums(Model m) {
        m.addAttribute("albums", albums);
        return "albums.html";
    }
}
