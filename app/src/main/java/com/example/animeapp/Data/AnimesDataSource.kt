package com.example.animeapp.Data

import com.example.animeapp.R

class AnimesDataSource {

    companion object {

        fun createCountriesList(): List<Anime> {
            return listOf(
                Anime(
                    "One Pice",
                    "Jaban",
                    R.drawable.image1,
                    "Follows the adventures of Monkey D. Luffy and his pirate crew in order to find the greatest treasure ever left by the legendary Pirate, Gold Roger. The famous mystery treasure named One Piece.",
                    "https://www.imdb.com/title/tt0388629/"),
                Anime(
                    "attack on titan ",
                    "Jaban",
                    R.drawable.image2,
                    " After his hometown is destroyed and his mother is killed, young Eren Jaeger vows to cleanse the earth of the giant humanoid Titans that have brought humanity to the brink of extinction..",
                    "https://www.imdb.com/title/tt2560140/"),
                Anime(
                    "Marco",
                    "Jaban",
                    R.drawable.image3,
                    "Marco  is the former 1st division commander of the Whitebeard Pirates. Once starting out as an apprentice on the crew, he had come to be Whitebeard's closest confidant and right-hand man After his captain's death, Marco assumed leadership of the Whitebeard Pirates until the crew's disbandment following the Payback War.",
                    "https://onepiece.fandom.com/wiki/Marco"),
                Anime(
                    "Zoro",
                    "Jaban",
                    R.drawable.image4,
                    "Roronoa Zoro,[1] also known as Pirate Hunter Zoro,[7] is the combatant of the Straw Hat Pirates, and one of their two swordsmen. Formerly a bounty hunter,[5] he is the second member of Luffy's crew and the first to join it, doing so in the Romance Dawn Arc.[3].",
                    "https://onepiece.fandom.com/wiki/Roronoa_Zoro"),
                Anime(
                    "Hunter × Hunter",
                    "Jaban",
                    R.drawable.image5,
                    "Hunter × Hunter ,pronounced Hunter Hunter, is a Japanese manga series.",
                    "https://hunterxhunter.fandom.com/wiki/Hunter_%C3%97_Hunter")

            )

        }

    }

}