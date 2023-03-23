package Ejercicio7.Controller;

import Ejercicio7.Modelo.Client;
import Ejercicio7.View.ClientView;

public class ClientController {
    private Client modelC;
    private ClientView viewC;

    public ClientController(Client modelC, ClientView viewC) {
        this.modelC = modelC;
        this.viewC = viewC;
    }

    public String getClientId() {
        return modelC.getClientId();
    }

    public void setClientId(String clientId) {
        modelC.setClientId(clientId);
    }

    public String getClientName() {
        return modelC.getClientName();
    }

    public void setClientName(String clientName) {
        modelC.setClientName(clientName);
    }

    public String getClientPhone() {
        return modelC.getClientPhone();
    }

    public void setClientPhone(String clientPhone) {
        modelC.setClientPhone(clientPhone);
    }

    public ClientView getViewC() {
        return viewC;
    }

    public void setViewC(ClientView viewC) {
        this.viewC = viewC;
    }

    public void updateViewC(){
        viewC.printClientDetails(modelC.getClientName(), modelC.getClientId(), modelC.getClientPhone());

    }
}
