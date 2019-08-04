package ir.sass.musicplayer.fragments;

public class PathModl
{
    private String name;
    private String directory;

    public PathModl(String name, String directory) {
        this.name = name;
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public String getDirectory() {
        return directory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }
}
