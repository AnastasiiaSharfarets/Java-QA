package farm.model;

public class Chip {
    private long id;
    private String owner;

    public Chip() {
    }

    public Chip(long id, String owner) {
        setId(id);
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public void setId(long id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Chip{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                '}';
    }
}
