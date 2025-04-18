package com.example.Pizzerav2.runner;



import com.example.Pizzerav2.model.Menu;

import com.example.Pizzerav2.service.MenuService;
import com.example.Pizzerav2.service.OrdineService;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class PizzeriaRunner implements CommandLineRunner {

    @Autowired
    MenuService menuService; // new MenuService();
    @Autowired
    OrdineService ordineService;
    @Autowired @Qualifier("crea_menu")
    ObjectProvider<Menu> menuObjectProvider;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Pizzeria Runner");





// MENU CRUD
       //menuService.salvaMenu(menuService.creamenu());
        menuService.menuStamp(menuService.findMenuById(1));
        //menuService.removeMenu(2);
        Menu menu=menuService.findMenuById(1);
        //menu.setNome("Pizzeria al Ponte2");
        //menuService.updateMenu(menu);

       
// ORDINE CRUD
        ordineService.creaNordini(10,1);
    //Ordine ordine = ordineService.getOrdineById(1L);
    //ordine.setListaProdotti(ordineService.getRandomProdotto(5,1L));
        //ordineService.modificaOrdine(ordine);
      // ordineService.removeOrdine(1);
        ordineService.stampaordini();

        // CLIENTE CRUD
        //Cliente c=ordineService.creaFakeCliente();
        //System.out.println(ordineService.getClienteById(c.getId()));

        //c=ordineService.getCustomCliente("Carmine","WTF","6456456");
        //ordineService.saveCliente(c);
        //ordineService.removeClient(6L);
//        Cliente c=ordineService.getClienteById(4L);
//        c.setNome("Carmine");
//        c.setCognome("wtf");
//        c.setTelefono("8798787655");
//        ordineService.modificaCliente(c);

        ordineService.stampaListaCliente();



    }
}
