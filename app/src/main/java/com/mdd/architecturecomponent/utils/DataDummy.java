package com.mdd.architecturecomponent.utils;


import com.mdd.architecturecomponent.data.remote.response.Movie;

import java.util.ArrayList;
import java.util.List;

public class DataDummy {

    // todo for generate data dummy
    public static List<com.mdd.architecturecomponent.data.Movie> generateDummyMovies() {
        List<com.mdd.architecturecomponent.data.Movie> movies = new ArrayList<>();

        movies.add(new com.mdd.architecturecomponent.data.Movie(
                "01",
                "Avengers: Endgame",
                "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos’ actions and restore order to the universe once and for all, no matter what consequences may be in store.",
                "US", " Marvel Studios", "2019", "181 minutes",
                "https://www.goodnewsfromindonesia.id/uploads/post/large-avengers-endgame-poster-top-half-b0a33264c72a0bb55c56035fb056bb90.jpg")
        );
        movies.add(new com.mdd.architecturecomponent.data.Movie(
                "02",
                "Spider-Man: Homecoming ",
                "Following the events of Captain America: Civil War, Peter Parker, with the help of his mentor Tony Stark, tries to balance his life as an ordinary high school student in Queens, New York City, with fighting crime as his superhero alter ego Spider-Man as a new threat, the Vulture, emerges.",
                "US", " Marvel Studios", "2017", "133 minnutes",
                "https://upload.wikimedia.org/wikipedia/id/f/f9/Spider-Man_Homecoming_poster.jpg")
        );
        movies.add(new com.mdd.architecturecomponent.data.Movie(
                "03",
                "Captain America: Civil War",
                "Following the events of Age of Ultron, the collective governments of the world pass an act designed to regulate all superhuman activity. This polarizes opinion amongst the Avengers, causing two factions to side with Iron Man or Captain America, which causes an epic battle between former allies.",
                "US", " Marvel Studios", "2016", "147 minutes",
                "https://upload.wikimedia.org/wikipedia/id/thumb/5/53/Captain_America_Civil_War_poster.jpg/220px-Captain_America_Civil_War_poster.jpg")
        );
        movies.add(new com.mdd.architecturecomponent.data.Movie(
                "04",
                "Aquaman",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm’s half-human, half-Atlantean brother and true heir to the throne.",
                "US", " Marvel Studios", "2018", "144 minutes",
                "https://upload.wikimedia.org/wikipedia/id/3/3a/Aquaman_poster.jpg")
        );
        movies.add(new com.mdd.architecturecomponent.data.Movie(
                "05",
                "Thor: Ragnarok",
                "Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his home-world and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.",
                "US", " Marvel Studios", "2017", "131 minutes",
                "https://upload.wikimedia.org/wikipedia/id/thumb/b/be/Thor_Ragnarok_poster_2.jpg/220px-Thor_Ragnarok_poster_2.jpg")
        );
        movies.add(new com.mdd.architecturecomponent.data.Movie(
                "06",
                "Black Panther",
                "King T’Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country’s new leader. However, T’Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T’Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan ‘special forces’) and an American secret agent, to prevent Wakanda from being dragged into a world war.",
                "US", "Marvel Studios", "2018", "134 minutes",
                "https://upload.wikimedia.org/wikipedia/id/0/0c/Black_Panther_film_poster.jpg")
        );
        movies.add(new com.mdd.architecturecomponent.data.Movie(
                "07",
                "The Incredible Hulk",
                "Scientist Bruce Banner scours the planet for an antidote to the unbridled force of rage within him: the Hulk. But when the military masterminds who dream of exploiting his powers force him back to civilization, he finds himself coming face to face with a new, deadly foe.",
                "US", " Marvel Studios", "2008", "114 minutes",
                "https://upload.wikimedia.org/wikipedia/id/thumb/e/e6/Hulk_poster.jpg/220px-Hulk_poster.jpg")
        );
        movies.add(new com.mdd.architecturecomponent.data.Movie(
                "08",
                "Sonic the Hedgehog",
                "Based on the global blockbuster videogame franchise from Sega, Sonic the Hedgehog tells the story of the world’s speediest hedgehog as he embraces his new home on Earth. In this live-action adventure comedy, Sonic and his new best friend team up to defend the planet from the evil genius Dr. Robotnik and his plans for world domination.",
                "US", " Marvel Studios", "2020", "99 minutes",
                "https://upload.wikimedia.org/wikipedia/id/thumb/c/c1/Sonic_the_Hedgehog_poster.jpg/220px-Sonic_the_Hedgehog_poster.jpg")
        );
        movies.add(new com.mdd.architecturecomponent.data.Movie(
                "09",
                "Captain America: The First Avenger",
                "During World War II, Steve Rogers is a sickly man from Brooklyn who’s transformed into super-soldier Captain America to aid in the war effort. Rogers must stop the Red Skull – Adolf Hitler’s ruthless head of weaponry, and the leader of an organization that intends to use a mysterious device of untold powers for world domination.",
                "US", " Marvel Studios", "2011", "124 minutes",
                "https://upload.wikimedia.org/wikipedia/id/3/37/Captain_America_The_First_Avenger_poster.jpg")
        );
        movies.add(new com.mdd.architecturecomponent.data.Movie(
                "10",
                "Iron Man 3",
                "When Tony Stark’s world is torn apart by a formidable terrorist called the Mandarin, he starts an odyssey of rebuilding and retribution.",
                "US", " Marvel Studios", "2013", "130 minutes",
                "https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg")
        );

        return movies;
    }

    public static List<Movie> generateRemoteDummyMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(
                "Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his home-world and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.",
                "EN","Thor","https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "2020",1,"Thor","2020")
        );
        movies.add(new Movie(
                "Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his home-world and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.",
                "EN","Thor","https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "2020",2,"Thor","2020")
        );
        movies.add(new Movie(
                "Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his home-world and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.",
                "EN","Thor","https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "2020",3,"Thor","2020")
        );
        movies.add(new Movie(
                "Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his home-world and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.",
                "EN","Thor","https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "2020",4,"Thor","2020")
        );
        movies.add(new Movie(
                "Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his home-world and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.",
                "EN","Thor","https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "2020",5,"Thor","2020")
        );
        movies.add(new Movie(
                "Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his home-world and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.",
                "EN","Thor","https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "2020",6,"Thor","2020")
        );
        movies.add(new Movie(
                "Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his home-world and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.",
                "EN","Thor","https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "2020",7,"Thor","2020")
        );
        movies.add(new Movie(
                "Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his home-world and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.",
                "EN","Thor","https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "2020",8,"Thor","2020")
        );
        movies.add(new Movie(
                "Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his home-world and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.",
                "EN","Thor","https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "2020",9,"Thor","2020")
        );
        movies.add(new Movie(
                "Thor is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the destruction of his home-world and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.",
                "EN","Thor","https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/id/thumb/d/d5/Iron_Man_3_theatrical_poster.jpg/220px-Iron_Man_3_theatrical_poster.jpg",
                "2020",10,"Thor","2020")
        );

        return movies;
    }

}
