package com.sdl.dxa.core;

import com.sdl.webapp.common.api.model.entity.Article;
import com.sdl.webapp.common.api.model.entity.Configuration;
import com.sdl.webapp.common.api.model.entity.ContentList;
import com.sdl.webapp.common.api.model.entity.Download;
import com.sdl.webapp.common.api.model.entity.Image;
import com.sdl.webapp.common.api.model.entity.ItemList;
import com.sdl.webapp.common.api.model.entity.LinkList;
import com.sdl.webapp.common.api.model.entity.NavigationLinks;
import com.sdl.webapp.common.api.model.entity.Notification;
import com.sdl.webapp.common.api.model.entity.Place;
import com.sdl.webapp.common.api.model.entity.SitemapItem;
import com.sdl.webapp.common.api.model.entity.TagLinkList;
import com.sdl.webapp.common.api.model.entity.Teaser;
import com.sdl.webapp.common.api.model.entity.YouTubeVideo;
import com.sdl.webapp.common.api.model.page.PageModelImpl;
import com.sdl.webapp.common.api.model.region.RegionModelImpl;
import com.sdl.webapp.common.impl.AbstractInitializer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CoreInitializer extends AbstractInitializer {

    private static final String AREA_NAME = "Core";

    @PostConstruct
    public void registerViewModelEntityClasses() {

        registerViewModel("Article", Article.class);
        registerViewModel("Accordion", ItemList.class);
        registerViewModel("Breadcrumb", NavigationLinks.class);
        registerViewModel("Carousel", ItemList.class);
        registerViewModel("CookieNotificationBar", Notification.class);
        registerViewModel("Download", Download.class);
        registerViewModel("FooterLinkGroup", LinkList.class);
        registerViewModel("FooterLinks", LinkList.class);
        registerViewModel("HeaderLinks", LinkList.class);
        registerViewModel("HeaderLogo", Teaser.class);
        registerViewModel("Image", Image.class);
        registerViewModel("LeftNavigation", NavigationLinks.class);
        registerViewModel("LanguageSelector", Configuration.class);
        registerViewModel("List", ContentList.class);
        registerViewModel("OldBrowserNotificationBar", Notification.class);
        registerViewModel("PagedList", ContentList.class);
        registerViewModel("Place", Place.class);
        registerViewModel("SiteMap", SitemapItem.class);
        registerViewModel("SiteMapXml", SitemapItem.class);
        registerViewModel("SocialLinks", TagLinkList.class);
        registerViewModel("SocialSharing", TagLinkList.class);
        registerViewModel("Tab", ItemList.class);
        registerViewModel("Teaser-ImageOverlay", Teaser.class);
        registerViewModel("Teaser", Teaser.class);
        registerViewModel("TeaserColored", Teaser.class);
        registerViewModel("TeaserHero-ImageOverlay", Teaser.class);
        registerViewModel("TeaserMap", Teaser.class);
        registerViewModel("ThumbnailList", ContentList.class);
        registerViewModel("TopNavigation", NavigationLinks.class);
        registerViewModel("YouTubeVideo", YouTubeVideo.class);

        registerViewModel("GeneralPage", PageModelImpl.class);
        registerViewModel("IncludePage", PageModelImpl.class);
        registerViewModel("RedirectPage", PageModelImpl.class);

        registerViewModel("2-Column", RegionModelImpl.class);
        registerViewModel("3-Column", RegionModelImpl.class);
        registerViewModel("4-Column", RegionModelImpl.class);
        registerViewModel("Hero", RegionModelImpl.class);
        registerViewModel("Info", RegionModelImpl.class);
        registerViewModel("Left", RegionModelImpl.class);
        registerViewModel("Links", RegionModelImpl.class);
        registerViewModel("Logo", RegionModelImpl.class);
        registerViewModel("Main", RegionModelImpl.class);
        registerViewModel("Nav", RegionModelImpl.class);
        registerViewModel("Tools", RegionModelImpl.class);

        registerViewModel("Header", RegionModelImpl.class);
        registerViewModel("Footer", RegionModelImpl.class);
        registerViewModel("Left Navigation", RegionModelImpl.class);
        registerViewModel("Content Tools", RegionModelImpl.class);
    }

    @Override
    protected String getAreaName() {
        return AREA_NAME;
    }
}

