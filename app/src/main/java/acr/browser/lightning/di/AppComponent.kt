package acr.browser.lightning.di

import acr.browser.lightning.BrowserApp
import acr.browser.lightning.adblock.AssetsAdBlocker
import acr.browser.lightning.adblock.NoOpAdBlocker
import acr.browser.lightning.browser.BrowserPresenter
import acr.browser.lightning.browser.SearchBoxModel
import acr.browser.lightning.browser.TabsManager
import acr.browser.lightning.browser.activity.BrowserActivity
import acr.browser.lightning.browser.activity.ThemableBrowserActivity
import acr.browser.lightning.browser.fragment.BookmarksFragment
import acr.browser.lightning.browser.fragment.TabsFragment
import acr.browser.lightning.dialog.LightningDialogBuilder
import acr.browser.lightning.download.DownloadHandler
import acr.browser.lightning.download.LightningDownloadListener
import acr.browser.lightning.html.bookmark.BookmarkPage
import acr.browser.lightning.html.download.DownloadsPage
import acr.browser.lightning.html.history.HistoryPage
import acr.browser.lightning.html.homepage.StartPage
import acr.browser.lightning.network.NetworkConnectivityModel
import acr.browser.lightning.reading.activity.ReadingActivity
import acr.browser.lightning.search.SearchEngineProvider
import acr.browser.lightning.search.SuggestionsAdapter
import acr.browser.lightning.settings.activity.ThemableSettingsActivity
import acr.browser.lightning.settings.fragment.*
import acr.browser.lightning.utils.ProxyUtils
import acr.browser.lightning.view.LightningChromeClient
import acr.browser.lightning.view.LightningView
import acr.browser.lightning.view.LightningWebClient
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class), (LightningModule::class)])
interface AppComponent {

    fun inject(activity: BrowserActivity)

    fun inject(fragment: BookmarksFragment)

    fun inject(fragment: BookmarkSettingsFragment)

    fun inject(builder: LightningDialogBuilder)

    fun inject(fragment: TabsFragment)

    fun inject(lightningView: LightningView)

    fun inject(activity: ThemableBrowserActivity)

    fun inject(advancedSettingsFragment: AdvancedSettingsFragment)

    fun inject(app: BrowserApp)

    fun inject(proxyUtils: ProxyUtils)

    fun inject(activity: ReadingActivity)

    fun inject(webClient: LightningWebClient)

    fun inject(activity: ThemableSettingsActivity)

    fun inject(listener: LightningDownloadListener)

    fun inject(fragment: PrivacySettingsFragment)

    fun inject(startPage: StartPage)

    fun inject(historyPage: HistoryPage)

    fun inject(bookmarkPage: BookmarkPage)

    fun inject(downloadsPage: DownloadsPage)

    fun inject(presenter: BrowserPresenter)

    fun inject(manager: TabsManager)

    fun inject(fragment: DebugSettingsFragment)

    fun inject(suggestionsAdapter: SuggestionsAdapter)

    fun inject(chromeClient: LightningChromeClient)

    fun inject(downloadHandler: DownloadHandler)

    fun inject(searchBoxModel: SearchBoxModel)

    fun inject(searchEngineProvider: SearchEngineProvider)

    fun inject(generalSettingsFragment: GeneralSettingsFragment)

    fun inject(displaySettingsFragment: DisplaySettingsFragment)

    fun inject(networkConnectivityModel: NetworkConnectivityModel)

    fun provideAssetsAdBlocker(): AssetsAdBlocker

    fun provideNoOpAdBlocker(): NoOpAdBlocker

}
