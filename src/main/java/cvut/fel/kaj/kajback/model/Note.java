package cvut.fel.kaj.kajback.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class Note
{
    @Id
    @GeneratedValue
            (strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String text;

    @Column(nullable = false, name = "name")
    private String header;
    private LocalDateTime time;
    private boolean urgency = false;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
