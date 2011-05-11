package lv.testdatabuilders.account;


public class CompanyBuilder {

    private Long id;
    private String name;

    public Company build() {
        Company company = new Company();
        company.setId(id);
        company.setName(name);
        return company;
    }

    public CompanyBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public CompanyBuilder withName(String name) {
        this.name = name;
        return this;
    }

}
