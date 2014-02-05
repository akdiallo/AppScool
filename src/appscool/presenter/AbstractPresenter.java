/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool.presenter;

import appscool.model.AbstractModel;
import appscool.view.AbstractView;

/**
 *
 * @author khadre
 */
public interface AbstractPresenter {
    // must have a variable model
    // must have a variable view

    // getters
    public AbstractView getView();
    public AbstractModel getModel();

    // setters
    public void setView(AbstractView view);
    public void setModel(AbstractModel model);

}
