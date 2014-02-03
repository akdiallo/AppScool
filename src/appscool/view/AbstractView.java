/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool.view;

import appscool.presenter.AbstractPresenter;

/**
 *
 * @author khadre
 */
public interface AbstractView {

    // getter
    public AbstractPresenter getPresenter();

    // setter
    public void setPresenter(AbstractPresenter presenter);


}
