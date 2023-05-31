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
