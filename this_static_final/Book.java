//package This_Static_final;

    public  class Book{
        static String libName= "The doon Library's";
        String title;
        String author;
        final String isbn="not replaceable";

        public Book(String title,String author) {
            this.title=title;
            this.author=author;

        }
         void showBookDetails(){
            System.out.println("the name of the library is:"+libName);
            System.out.println("the title of the book is :"+title);
            System.out.println("the author name is:"+author);
            System.out.println("isbn:"+isbn);
            System.out.println();


        }

        public static void main(String[] args) {
            Book b1=new Book("avenger","Devansh");
            Book b2=new Book("harry potter","abhay");    
            
            if (b1 instanceof Book) {
                b1.showBookDetails();
             }
             if(b2 instanceof Book){
                b2.showBookDetails();
             }
        }



        

    }

