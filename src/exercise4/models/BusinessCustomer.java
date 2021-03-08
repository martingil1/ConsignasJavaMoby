package exercise4.models;

import exercise4.models.enums.ConditionIVA;

public class BusinessCustomer extends Customer{

    private String cuit;
    private ConditionIVA conditionIVA;
    private String target;

    public BusinessCustomer(Integer code, String name, String surname, String birthday, String phone, String dni,
                            Boolean isConsumerFinal, String cuit, ConditionIVA conditionIVA, String target) {
        super(code, name, surname, birthday, phone, dni, isConsumerFinal);
        this.cuit = cuit;
        this.conditionIVA = conditionIVA;
        this.target = target;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public ConditionIVA getConditionIVA() {
        return conditionIVA;
    }

    public void setConditionIVA(ConditionIVA conditionIVA) {
        this.conditionIVA = conditionIVA;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "BusinessCustomer: " +
                "\ncuit: " + cuit +
                "\nconditionIVA: " +
                "\ntarget: " + target;
    }
}
