/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool.presenter;

import appscool.model.AbstractModel;
import appscool.model.AdministratorModel;
import appscool.view.AbstractView;
import appscool.view.admin.AuthentificationAdminView;

/**
 *
 * @author khadre
 */
public class AuthentificationAdminPresenter implements AbstractPresenter{
    private AdministratorModel authentificationModel ;
    private AuthentificationAdminView authentificationView;

    @Override
    public AbstractView getView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AbstractModel getModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setView(AbstractView view) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setModel(AbstractModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
