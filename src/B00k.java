public class B00k {
    private String title;
    private String author;
    private String year;
    private boolean isAv;

    public B00k(String title, String author, String year, boolean isAv) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAv = isAv;
    }

    public B00k(String title,String author)
    { this(title,author,0,true)};

    public void borrowBOOk() {
        if (isAv) {
            isAv = false;
            System.out.println(title + " была успешно взята.");
        } else {
            System.out.println(title + " недоступна.");
        }
        public void returnBOOk() {
            isAv = true;
            System.out.println(title + " возвращена в библиотеку.");

            public void returnBOOk() {
                isAv = true;
                System.out.println(title + " возвращена в библиотеку.");
            }

            public String getAuthor() {
                return author;
            }

            public boolean isAv() {
                return isAv;
            }
        }
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isAv() {
        return isAv;
    }

    public void setAv(boolean av) {
        isAv = av;
    }
}
