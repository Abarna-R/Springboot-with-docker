package com.stackroute.MuzixMongoDb;


import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tracks")
public class TracksRestApi {
    private TracksRepo trackslist;

    public TracksRestApi(TracksRepo thetracks) {
        this.trackslist = thetracks;
    }

    @GetMapping("/all")
    public List<Tracks> getAll()
    {
        return trackslist.findAll();
    }

    @DeleteMapping("/delete/{TrackId}")
    public void delete(@PathVariable int TrackId)
    {
        this.trackslist.deleteById(TrackId);
    }

    @PutMapping("/inserting")
    public void insert(@RequestBody Tracks tracks)
    {
        this.trackslist.insert(tracks);

    }

    @PostMapping("/update")
    public void update(@RequestBody Tracks updatetrack)
    {
        this.trackslist.save(updatetrack);
    }


}
