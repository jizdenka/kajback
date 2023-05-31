package cvut.fel.kaj.kajback.model;

import jakarta.persistence.Column;

public class NoteDTO
{
    private Long id;

    private String text;
    private String header;
    private String time;
    private boolean urgency = false;
    private boolean deleted = false;

    public boolean isDeleted() {
        return deleted;
    }

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isUrgency() {
        return urgency;
    }

    public void setUrgency(boolean urgency) {
        this.urgency = urgency;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Note getNote()
    {
        Note note = new Note();
        note.setUrgency(urgency);
        note.setId(id);
        note.setTime(time);
        note.setText(text);
        note.setHeader(header);
        return note;
    }
}
