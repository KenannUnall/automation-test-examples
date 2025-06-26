import { Given, And, When, Then } from "cypress-cucumber-preprocessor/steps";

Given("Ziraat Web Sitesine Git", () => {
  cy.viewport('macbook-16')
  cy.visit("https://www.ziraatbank.com.tr/tr");
});

And("Cerezi Kapa {string}", (cerez) => {
    cy.get('.cookie-box > .icon-close').should('be.visible').click()
});

And("Menudeki Bireysel Secenegi Uzerine Gelerek Kredileri Sec", () => {
    cy.get('.header-right > .navigation > :nth-child(1) > :nth-child(1) > [href="/tr/bireysel"]').should('be.visible').trigger('mouseover').wait(2000)
    cy.get('.header-right > .navigation > :nth-child(1) > :nth-child(1) > .sub-navigation-container > .sub-navigation > .row > :nth-child(1) > ul > :nth-child(2) > a').should('be.visible').wait(2000).click()
});


And("Tuketici Kredisi Kismina Tikla", () => {
    cy.get(':nth-child(1) > :nth-child(1) > .landing-item-box > .row > :nth-child(1) > .link-col-1 > :nth-child(2) > a').should('be.visible').wait(2000).click();
});

And("Hesaplama Araci Butonuna Tikla", () => {
    cy.get('.col-lg-4 > .sub-page-image > #ctl00_PlaceHolderMain_ctl05__ControlWrapper_RichHtmlField > [href="/tr/hesaplama-araclari/kredi-hesaplama/tuketici-kredisi"]').should('be.visible').wait(2000).click();
});

And("Sayfayi Asagi Kaydir", () => {
    cy.get('.selected').scrollIntoView();
    
});

And("Krediyi Sec {string}", (kredi) => {
    cy.get('.selected').click();
    cy.contains('.list.active span', kredi).should('be.visible').wait(2000).click();
    
  });

And("Tutari Yaz {string}", (tutar) => {
    cy.get('#calc-tutar').should('be.visible').clear().type(tutar).wait(2000)
});

And("Vadeyi Yaz {string}", (vade) => {
    cy.get('#calc-vade').should('be.visible').clear().type(vade).wait(2000)
});

Then("Hesapla Butonuna Tikla", () => {
    cy.get('.pull-right > .btn').click().wait(4000)
});