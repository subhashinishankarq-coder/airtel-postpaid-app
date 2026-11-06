# Airtel Postpaid Plans Android app

## Build the installable APK using only your Android phone (cloud build)

You do not need Android Studio or a computer. You will need a free GitHub account and a browser.

1. Open https://github.com and sign in (create a free account if needed).
2. Create a new repository. Name it `airtel-postpaid-app`. Choose Public or Private.
3. On the new repository page, choose **Add file > Upload files**.
4. Extract this ZIP on your phone first, then upload the contents of this project (including the `.github` folder). Make sure `.github/workflows/build-apk.yml` is uploaded.
5. Commit the uploaded files.
6. Open the repository's **Actions** tab. Choose **Build Airtel Postpaid APK** on the left.
7. Tap **Run workflow** and confirm. Wait for the workflow to finish successfully.
8. Open the completed workflow run, scroll to **Artifacts**, and download `Airtel-Postpaid-debug-APK`.
9. Extract that downloaded artifact and tap `app-debug.apk` to install. If Android asks, allow your browser/files app to install unknown apps.

## Project details
- Android app uses a WebView and bundled HTML.
- Plan rental, 18% GST calculation, family connections, subscription summary, search and comparison.
- Minimum Android version: Android 6.0 (API 23).

## Important plan accuracy note
Plan prices and benefit summaries in this demo are based on Airtel's published postpaid terms retrieved on 6 Nov 2026. Benefits and eligibility can change by circle and offer. Verify in Airtel's official terms and internal activation systems before quoting or activating:
https://www.airtel.in/mobile/terms-conditions/postpaid

GST is calculated as 18% of monthly rental. The app does not calculate deposits, one-time activation charges, usage charges, add-ons or prorated first bills.
