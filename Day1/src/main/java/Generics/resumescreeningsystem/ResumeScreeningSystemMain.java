package resumescreeningsystem;

public class ResumeScreeningSystemMain {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        softwareEngineerResumes.addResume(new SoftwareEngineer("Amit", "Java, Python, C++"));
        softwareEngineerResumes.addResume(new SoftwareEngineer("Ravi", "JavaScript, React, Node.js"));

        Resume<DataScientist> dataScientistResumes = new Resume<>();
        dataScientistResumes.addResume(new DataScientist("Palak", "Python, Ruby, Machine Learning"));
        dataScientistResumes.addResume(new DataScientist("Abhishek", "SQL, Python, Data Analysis"));

        Resume<ProductManager> productManagerResumes = new Resume<>();
        productManagerResumes.addResume(new ProductManager("Nikita", "Product Lifecycle, Roadmapping, Agile"));
        productManagerResumes.addResume(new ProductManager("Vipin", "Market Research, UX, Strategy"));

        System.out.println("Software Engineer Resumes:");
        ResumeUtility.displayResumes(softwareEngineerResumes.getResumes());
        System.out.println("----------------");

        System.out.println("Data Scientist Resumes:");
        ResumeUtility.displayResumes(dataScientistResumes.getResumes());
        System.out.println("----------------");

        System.out.println("Product Manager Resumes:");
        ResumeUtility.displayResumes(productManagerResumes.getResumes());


    }
}
