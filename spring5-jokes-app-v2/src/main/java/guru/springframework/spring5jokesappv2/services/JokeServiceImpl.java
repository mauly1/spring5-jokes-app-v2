package guru.springframework.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    private final NewChuckNorrisQuotes newChuckNorrisQuotes;

    public JokeServiceImpl() {
        this.newChuckNorrisQuotes = new NewChuckNorrisQuotes();
    }

    @Override
    public String getJokes() {
        return newChuckNorrisQuotes.getRandomQuote();
    }
}
