

public abstract class Product {
        protected String name;
        protected String category;
        protected double price;

        Product(String name, String category, double price){
            this.name = name;
            this.category = category;
          //  this.price = price;
        }
        Product(String name, String category){
            this(name, category, 0);
        }
        
        public String GetName(){
            return this.name;
        }
        public String GetCategory(){
            return this.category;
        }
        public void Setname(String name){
            this.name = name;
        }
        public void SetCategoty(String category){
            this.category = category;
        }

}
