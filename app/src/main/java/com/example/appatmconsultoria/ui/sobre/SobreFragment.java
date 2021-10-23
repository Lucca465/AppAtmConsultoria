package com.example.appatmconsultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appatmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreFragment extends Fragment {

    public SobreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String descrição = "A ATM Consultoria tem como missão apoiar organizações que desejam alcançar " +
                "o sucesso atráves da excelência em gestão e da busca pela qualidade";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descrição)

                .addGroup("Entre em contato")
                .addEmail("Atendimento@atmconsultoria.com.br", "Envie seu email")
                .addWebsite("http://www.google.com/", "Acesse nosso site")

                .addGroup("Redes sociais")
                .addFacebook("atmconsultoria", "Facebook")
                .addInstagram("atmconsultoria", "Instagram")
                .addTwitter("atmconsultoria", "Twitter")
                .addYoutube("atmconsultoria", "YouTube")
                .addGitHub("atmconsultoria", "GitHub")
                .addPlayStore("com.facebook.katana", "Download App")

                .addItem(versao)

                .create();

        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }
}