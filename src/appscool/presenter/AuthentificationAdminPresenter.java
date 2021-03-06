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
        return authentificationView;
    }

    @Override
    public AbstractModel getModel() {
        return authentificationModel;
    }

    @Override
    public void setView(AbstractView view) {
        this.authentificationView = (AuthentificationAdminView)view;
    }

    @Override
    public void setModel(AbstractModel model) {
        this.authentificationModel = (AdministratorModel) model;
    }

}
